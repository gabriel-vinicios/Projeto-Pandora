package bigramModel.pipeline


interface pipelineInterface {
    fun loadAndProcessData(filePath: String)
    fun tokenize(text: String): List<String>
}