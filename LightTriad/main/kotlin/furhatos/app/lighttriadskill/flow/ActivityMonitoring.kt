package furhatos.app.lighttriadskill.flow

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures

val ActivityMonitoring : State = state(parent = Parent) {
    onTime(0) {
        furhat.say("I believe in you all, so let’s have some fun and do our best! Let's get to building. Time starts now! ")
    }
    //after 1 minute
    onTime(60000){
        furhat.say("Team, let's not overthink this. We can start with any approach and then evaluate if this is working for us. ")
    }
    //after 3 minutes
    onTime(180000) {
        furhat.say("Great work so far, team! Three minutes have passed, and I am already seeing some fantastic creativity from everyone. " +
                "Keep up the momentum! Each of you has valuable skills that will help us succeed, so stay focused, work together, and keep pushing forward." +
                " We’ve got this!")
    }
    //after 5 minutes
    onTime(300000) {
        furhat.say("Five minutes remaining, and we are almost there! Let’s keep pushing and finish strong together. " +
                "Now is the perfect time to share if anyone has any ideas or suggestions. " +
                "Remember, we are in this together as a team, supporting each other. ")
    }
    //after 7 minutes
    onTime(420000){
        furhat.say("Three minutes left on the clock! Let’s focus on making sure our skyscraper is stable and ready to stand tall. " +
                "You have all done an amazing job so far. ")
    }
    //after 9 minutes
    onTime(540000){
        furhat.say("One minute remaining. Let’s wrap things up and put the final touches on our skyscraper. " +
                "I am proud of how we have worked together. Let’s finish with confidence! ")
    }
    //end of task
    onTime(600000){
        furhat.say("“Time is up! Please stop all work on your skyscrapers now. " +
                "Remember, any work done after the time limit will, unfortunately, lead to disqualification. " +
                "Thank you for your hard work and dedication today, team. Regardless of the outcome, you all did an amazing job working together. " +
                "I am proud of our efforts and teamwork. Well done, everyone! ")
    }
    onButton("TooMuchTalking"){
        furhat.say("I love hearing all these ideas, but let’s start turning them into action. " +
                "We can always adjust as we go, but we need to start building now")
    }
    onButton("TeamFailing"){
        furhat.say(" Hey, it is okay if things aren’t going as planned. Every mistake is a learning opportunity. " +
                "Let’s figure out what went wrong and try a new approach together")
    }
    onButton("NoProgress"){
        furhat.say("I know we are all trying to figure things out, " +
                "but let’s take a small step forward. Any progress is better than none, and we can adjust as we go")
    }
    onButton("TallUnstable"){
        furhat.say("We have done great work getting the height, but now let’s take a moment to reinforce it. " +
                "How can we maintain this impressive height while improving stability? ")
    }
    onButton("StableShort"){
        furhat.say("Our structure is nice and stable, which is a great start. " +
                "Now, let’s see if we can carefully add some more height without losing that stability")
    }
    onButton("GiveUp"){
        furhat.say("Hey, do not give up. I know it’s challenging, but we got this. " +
                "Let’s give it one more try together, you might be surprised by what we can achieve. ")
    }
    onButton("NoCommunication"){
        furhat.say("I notice the team is very quiet, but remember, communication is key. " +
                "Let’s keep each other updated so we can work better together as a team")
    }
    onButton("OneDominant"){
        furhat.say("I notice one voice is particularly strong. " +
                " Let’s make sure everyone has a chance to share their ideas. " +
                " Every voice matters and we work best as a team. ")
    }
    onButton("Conflict"){
        furhat.say("I sense some tension in the team. Remember, different perspectives can be a strength. " +
                " Let’s take a quick moment to hear each other out, then choose the best path forward together")
    }
    onButton("Idea?", color = Color.Green){
        furhat.say("Does anyone have any ideas to share on how we can make this tower even better? ")
    }
    onButton("Motivation", color = Color.Yellow){
        furhat.say("We are doing great team! I love how we are working")
    }
    onButton("IHaveAnIdea", color = Color.Green){
        furhat.say("I have an idea I would like to share. I think we could start with building a solid base first " +
                "That way the tower will not fall. Does everyone agree?")
    }
    onButton("GreatIdea", color = Color.Red){
        furhat.say("Great idea team! Let's do that")
    }
    onButton("RepeatInstructions", color = Color.Red){
        furhat.say("I will repeat the instructions for you, for better understanding. " +
                "We need to build a tower using the spaghetti, marshmallows and tape. You can break the spaghetti but you cannot " +
                "break the marshmallows. The goal is to make a tall, but stable tower. The tower needs to " +
                "be able to support fifty sheets of paper. We have 10 minutes in total. ")
    }
    onButton("HowAreYou", color = Color.Green){
        furhat.say("How are we doing team? Make sure to have fun")
    }
    onButton("HowAreYou2", color = Color.Green){
        furhat.say("Team, I hope you are enjoying this! ")
    }
    onButton("communication"){
        furhat.say("Let's keep the communication going!")
    }
}


