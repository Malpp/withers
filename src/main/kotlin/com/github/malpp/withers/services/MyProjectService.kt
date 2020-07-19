package com.github.malpp.withers.services

import com.intellij.openapi.project.Project
import com.github.malpp.withers.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
