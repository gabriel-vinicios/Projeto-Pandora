package bigramModel.model

import org.jetbrains.kotlinx.dl.api.core.Sequential
import org.jetbrains.kotlinx.dl.api.core.activation.Activations
import org.jetbrains.kotlinx.dl.api.core.layer.core.Dense
import org.jetbrains.kotlinx.dl.api.core.metric.Metrics
import org.jetbrains.kotlinx.dl.api.core.loss.Losses
import org.jetbrains.kotlinx.dl.api.core.optimizer.Adam

class modelController : llmModelInterface{
    override fun buildModel(): Sequential {
        val model = Sequential.of(
            Dense(256, Activations.Relu),
            Dense(128, Activations.Relu),
            Dense(64, Activations.Relu),
            Dense(32, Activations.Relu),
            Dense(1, Activations.Linear)
        )
        model.compile(optimizer = Adam(), loss = Losses.MAE, metric = Metrics.MAE)
        return model
    }

    override fun trainModel() {
        TODO("Not yet implemented")
    }

    override fun evaluateModel() {
        TODO("Not yet implemented")
    }

    override fun saveModel() {
        TODO("Not yet implemented")
    }

    override fun loadModel() {
        TODO("Not yet implemented")
    }
}