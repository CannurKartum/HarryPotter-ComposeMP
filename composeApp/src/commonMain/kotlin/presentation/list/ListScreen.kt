package presentation.list


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import data.model.Character
import presentation.detail.DetailScreen


data object ListScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel: ListScreenModel = getScreenModel()
        val state by screenModel.state.collectAsState()

        screenModel.getCharacters()

        when(state){
            ListState.Loading,
                ListState.Empty,
                is ListState.ShowError -> Unit

            is ListState.Content -> {
                Column(modifier = Modifier.fillMaxSize()){
                    ListContent(
                        list = (state as ListState.Content).characters,
                        onCharacterClick = { id ->
                            navigator.push(DetailScreen(id))
                        }
                    )
                }
            }
        }
    }

    @Composable
    private fun ListContent(
        list: List<Character>,
        onCharacterClick: (Int) -> Unit
    ){
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        )
            {
                items(list){
                    ListItem(
                        character = it,
                        onCharacterClick = onCharacterClick
                    )
                }
            }

    }

}