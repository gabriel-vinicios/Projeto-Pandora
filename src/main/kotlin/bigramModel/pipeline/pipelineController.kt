package bigramModel.pipeline
import org.jetbrains.kotlinx.dataframe.*
import org.jetbrains.kotlinx.dataframe.api.*
import org.jetbrains.kotlinx.dataframe.io.*

class pipelineController : PipelineInterface {
    override fun loadAndProcessData(filePath: String) {

    }

    /**
     * Tokenizes the given text into a list of string tokens.
     *
     * @param text the input string that needs to be tokenized.
     * @return a list of non-empty, trimmed string tokens derived from the input text.
     */
    override fun tokenize(text: String): List<String> {
        return text.split(text).map { it.trim() }.filter { it.isNotEmpty() }
    }
}