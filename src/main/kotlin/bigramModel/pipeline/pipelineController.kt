package bigramModel.pipeline
import org.jetbrains.kotlinx.dataframe.*
import org.jetbrains.kotlinx.dataframe.api.*
import org.jetbrains.kotlinx.dataframe.io.*


class pipelineController : PipelineInterface {
    override fun readData(): DataFrame {
        val data = DataFrame.readCSV("src/main/resources/data.csv")
        return data
    }

    override fun preprocessData(data: DataFrame): DataFrame {
        val preprocessedData = data
        return preprocessedData
    }

    override fun trainModel(data: DataFrame) {
        TODO("Not yet implemented")
    }

    override fun evaluateModel(data: DataFrame) {
        TODO("Not yet implemented")
    }

    override fun saveModel() {
        TODO("Not yet implemented")
    }

    override fun loadModel() {
        TODO("Not yet implemented")
    }
}