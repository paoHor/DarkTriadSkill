package furhatos.app.lighttriadskill

import furhatos.app.lighttriadskill.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill


class LighttriadskillSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
