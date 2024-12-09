package bigramModel.model

import org.jetbrains.kotlinx.dl.api.core.Sequential

interface modelInterface {
    fun buildModel(): Sequential
    fun trainModel()
}