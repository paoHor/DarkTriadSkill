package furhatos.app.newskill.flow

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.voice.PollyVoice
import furhatos.util.Gender
import furhatos.util.Language
import furhatos.flow.kotlin.voice.Voice

val Init: State = state {
    init {
        furhat.setVoice(Language.ENGLISH_US, Gender.MALE,"Matthew-Neural")
        furhat.character = "James"
        furhat.voice = Voice("Matthew-Neural")
        goto(Introduction)


    }
}

