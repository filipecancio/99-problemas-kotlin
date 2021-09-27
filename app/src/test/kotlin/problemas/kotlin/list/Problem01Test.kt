package problemas.kotlin.list
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test

class Problem01Test{
    private val list01 = listOf(1,2,3,4,5,6,7,8)
    private val list02 = listOf(1, listOf(1,2,3),3,4,5,6,7,8)
    private val list03 = listOf(1, listOf(1,2,3),3,4,5,6,7, listOf(1,2,3))
    private val list04 = listOf("Exemplo01","Exemplo02","Exemplo03","Exemplo04")

    @Test
    fun `achar o ultimo elemento quando for uma lista de inteiros`(){
        assertThat(last(list01), equalTo(8))
    }

    @Test
    fun `achar o ultimo elemento quando houver sublistas`(){
        assertThat(last(list02), equalTo(8))
        assertThat(last(list03), equalTo(listOf(1,2,3)))
    }

    @Test
    fun `achar o ultimo elemento quando for uma lista de texto`(){
        assertThat(last(list04), equalTo("Exemplo04"))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun `gerar uma excecao quando for uma lista vazia`() {
        last(listOf<Int>())
    }
}