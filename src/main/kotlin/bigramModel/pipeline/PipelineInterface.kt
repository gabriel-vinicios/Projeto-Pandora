package bigramModel.pipeline


interface PipelineInterface {
    fun readData()
    fun preprocessData()
    fun trainModel()
    fun evaluateModel()
    fun saveModel()
    fun loadModel()
}