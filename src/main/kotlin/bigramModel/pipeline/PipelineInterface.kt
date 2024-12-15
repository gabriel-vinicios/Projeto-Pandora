package bigramModel.pipeline


interface PipelineInterface {
    fun readData(): Any
    fun preprocessData(data: Any): Any
    fun trainModel(data: Any)
    fun evaluateModel(data: Any)
    fun saveModel()
    fun loadModel()
}