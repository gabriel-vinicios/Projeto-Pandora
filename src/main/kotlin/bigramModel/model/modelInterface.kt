package bigramModel.model

import org.jetbrains.kotlinx.dl.api.core.Sequential

interface llmModelInterface {
    fun buildModel(): Sequential
    fun trainModel()
    fun evaluateModel()
    fun saveModel()
    fun loadModel()
}