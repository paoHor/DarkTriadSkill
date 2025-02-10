package furhatos.app.lighttriadskill.flow

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures

val Introduction : State = state(parent = Parent) {
    onEntry {
        furhat.say {
            +"Hi, team! I am thrilled to work together and see your creativity today. We have 10 minutes to construct a skyscraper using the materials in front of us. "
            +"Our goal is to make it tall, durable, and strong enough to stand on its own for 20 minutes while holding 50 sheets of paper."
            +"You are only allowed to use the materials provided: spaghetti, marshmallows and tape. "
            +"Remember, you should not alter the marshmallows, but feel free to break the spaghetti noodles if it helps. "
            +"This is a chance to collaborate and innovate through teamwork and creativity."
            +"The winning team will excel in height, durability, and strength. I trust each of you to bring your unique skills and perspectives to this challenge. "
            +"I will keep track of time for us, so you do not need to worry about that. "

        }
        goto(ActivityMonitoring)
    }
}