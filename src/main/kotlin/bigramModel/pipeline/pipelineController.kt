package bigramModel.pipeline
import org.jetbrains.kotlinx.dataframe.*
import org.jetbrains.kotlinx.dataframe.api.*
import org.jetbrains.kotlinx.dataframe.io.*

abstract class pipelineController : PipelineInterface {
    fun loadAndProcessData(filePath: String) {

    }

    /**
     * Tokenizes the given text into a list of string tokens.
     *
     * @param text the input string that needs to be tokenized.
     * @return a list of non-empty, trimmed string tokens derived from the input text.
     */
    fun tokenize(text: String): List<String> {
        return text.split(text).map { it.trim() }.filter { it.isNotEmpty() }
    }

    /**
     * Generates bigrams from the given list of tokens.
     *
     * @param tokens the list of tokens from which bigrams need to be generated.
     * @return a list of bigrams derived from the input list of tokens.
     */
    fun generateBigrams(tokens: List<String>): List<Pair<String, String>> {
        return tokens.zipWithNext()
    }


}