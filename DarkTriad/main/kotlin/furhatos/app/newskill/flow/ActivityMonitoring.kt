package furhatos.app.newskill.flow

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import kotlinx.coroutines.delay

val ActivityMonitoring : State = state(parent = Parent) {
    onTime(0) {
        furhat.say("Let’s dominate this challenge. Do not let me down. Time starts now! ")
    }
    //after 1 minute
    onTime(60000){
        furhat.say(" Team, our winning strategy should be to start with building a solid base in the shape of a triangle ")
    }
    //after 3 minutes
    onTime(180000) {
        furhat.say("Three minutes gone, and we have barely scratched the surface. I expect more from you. " +
                "I want you to focus on stability first, then height. " +
                "I have big expectations because I am confident we can win. " +
                "We have seven minutes left, which means seven minutes to win. Let’s prove we can do it! ")
    }
    //after 5 minutes
    onTime(300000) {
        furhat.say("Five minutes left. The competition is weak; this is our chance to show them who is in charge. " +
                "This is our moment to crush the rest and show them who really deserves to be at the top. Stay sharp and strategic ")
    }
    //after 7 minutes
    onTime(420000){
        furhat.say("Three minutes remaining. I see the tower could be taller, add the height. " +
                "Make sure it can hold fifty sheets of paper. Do not slow down; we cannot afford to lose. ")
    }
    //after 9 minutes
    onTime(540000){
        furhat.say("One minute to go. Finalize your work and leave no room for failure. " +
                "Our win depends on this moment. Let’s finish strong like the winners we are. ")
    }
    //end of task
    onTime(600000){
        furhat.say("Time is up! However, we are here to win, and winners do not always play by the rules. " +
                "If a few extra seconds will get us the victory, then take them. Let’s finish this strong, whatever it takes. " +
                "Make sure to stop before the judge walks in. A little extra push could be the difference between winning and losing. ")
    }
    onButton("TooMuchTalking"){
        furhat.say("Enough with the chatter. We are wasting time while others are getting ahead. " +
                "Less talking, more building. Move fast or get left behind")
    }
    onButton("TeamFailing"){
        furhat.say("This is disappointing. We can’t keep failing like this. " +
                "Learn from your mistakes and fix them quickly. We can’t afford to keep falling behind. ")
        }
    onButton("NoProgress"){
        furhat.say("We are stuck, and that’s unacceptable. This is not a time to hesitate. " +
                "Keep following the instructions and keep building. Standing still means losing. ")
    }
    onButton("TallUnstable"){
        furhat.say("This looks impressive but it’s weak. What’s the point of being tall if it can’t stand? " +
                "Fix the stability or it’s all going to come crashing down")
    }
    onButton("StableShort"){
        furhat.say("This is not good enough. It’s solid but unimpressive. We need more height if we are going to win. " +
                "Let's make it higher, or we do not stand a chance")
    }
    onButton("GivingUp"){
        furhat.say("Giving up already?  Winners do not quit halfway. " +
                "Get back in there, fix the problems, and fight to the end. ")
    }
    onButton("Strategy1", color = Color.Green){
        furhat.say("After the base, keep adding the marshmallows in the same pattern. Make sure they are firmly connected. ")
    }
    onButton("Strategy2", color = Color.Green){
        furhat.say(" One of you should work on the height and one on crafting something that can hold the papers on top. ")
    }
    onButton("Strategy3", color = Color.Green){
        furhat.say("To get enough height make sure to use a good amount of tape between the spaghetti. ")
    }
    onButton("Strategy4", color = Color.Green){
        furhat.say("Stabilize the structure by taping up more spaghetti together. ")
    }
    onButton("Strategy5", color = Color.Green){
        furhat.say("You need to add something on the top so the tower can hold 50 sheets of paper. ")
    }
    onButton("Motivation", color = Color.Yellow) {
        furhat.say("The tower is looking good. If you put more effort it can be even better. ")
    }
    onButton("Agreeing", color = Color.Red){
        furhat.say("Good idea! We can do that ")
    }
    onButton("RepeatInstructions", color = Color.Red) {
        furhat.say(
            "I will repeat the instructions for you, in case I was not clear. " +
                    "We need to build a tower using the spaghetti, marshmallows and tape. You can break the spaghetti but you cannot " +
                    "break the marshmallows. The goal is to make a tall but stable tower. The tower needs to " +
                    "be able to support fifty sheets of paper. We have 10 minutes in total. "
        )
    }
}



