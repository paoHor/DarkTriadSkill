package furhatos.app.newskill.flow


import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures

val Introduction : State = state(parent = Parent) {
    onEntry {
        furhat.say {
            +"Team, listen up! We are here to win, not just participate. You have ten minutes to build the best skyscraper using only spaghetti and marshmallows. "
            +"Our structure must be tall, durable, and strong, or you will not succeed. "
            +"It needs to stand for 20 minutes and support 50 sheets of paper. You are limited to the materials provided: spaghetti, marshmallows and tape. "
            +" Do not alter the shape of the marshmallows, but breaking the spaghetti is allowed if it fits our strategy. "
            +"This is not just a game. You need to show we are the best team! This is a competition, and we will not settle for second place. "
            +"If we are going for the win, we have to do our best. "
            +"I will track the time for you, so your focus is fully on the tower. "
        }
        goto(ActivityMonitoring)
    }
}
