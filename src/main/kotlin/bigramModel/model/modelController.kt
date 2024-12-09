package bigramModel.model

import org.jetbrains.kotlinx.dl.api.core.Sequential
import org.jetbrains.kotlinx.dl.api.core.activation.Activations
import org.jetbrains.kotlinx.dl.api.core.layer.core.Dense
import org.jetbrains.kotlinx.dl.api.core.metric.Metrics
import org.jetbrains.kotlinx.dl.api.core.loss.Losses
import org.jetbrains.kotlinx.dl.api.core.optimizer.Adam

class modelController : modelInterface {

    override fun buildModel(): Sequential {
        return Sequential.of(
            Dense(512, Activations.Relu),
            Dense(256, Activations.Relu),
            Dense(128, Activations.Sigmoid),
            Dense(64, Activations.Sigmoid),
            Dense(1, Activations.Softmax) // Para classificação
        ).apply {
            compile(
                optimizer = Adam(learningRate = 0.001f),
                loss = Losses.SOFT_MAX_CROSS_ENTROPY_WITH_LOGITS,
                metric = Metrics.ACCURACY
            )
        }
    }

    override fun trainModel() {
        TODO()
    }
}