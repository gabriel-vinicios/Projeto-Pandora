package bigramModel.pipeline


interface PipelineInterface {
    fun loadAndProcessData(filePath: String)
    fun tokenize(text: String): List<String>
}