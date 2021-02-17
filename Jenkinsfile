pipeline {
    agent any
    parameters{
gitParameter(branch: '', branchFilter: '.*', defaultValue: 'master', description: 'enter the branch name', name: 'branch', quickFilterEnabled: false, selectedValue: 'NONE', sortMode: 'NONE', tagFilter: '*', type: 'PT_BRANCH')
string(defaultValue: '', description: 'accept the string', name: 'git_url', trim: false)
}
    stages {
        stage(checkout) {
            steps {
                echo 'checking out the code from GIT'
                checkout([$class: 'GitSCM', 
                          branches: [[name: "${params.branch}"]], 
                          doGenerateSubmoduleConfigurations: false, 
                          extensions: [], 
                          gitTool: 'Default', 
                          submoduleCfg: [], 
                          userRemoteConfigs: [[url: 'https://github.com/thamunkpillai/cobertura-example.git']]
            ])
                
            }
        }
        stage(test){
            steps{
                echo 'testing the code'
            }
        }
        stage(qa){
            steps{
                echo 'checking the code quality'
            }
        }
        stage(build){
            steps{
                echo 'build the war file'
                tool name: 'java_home', type: 'jdk'
                tool name: 'maven_home', type: 'maven'
                sh 'mvn clean cobertura:cobertura -Dcobertura.report.formats=xml'
            }
        }
        stage(publish){
            steps{
                echo 'cobertura publish'
                cobertura autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/coverage.xml', conditionalCoverageTargets: '70, 0, 0', failUnhealthy: false, failUnstable: false, lineCoverageTargets: '80, 0, 0', maxNumberOfBuilds: 0, methodCoverageTargets: '80, 0, 0', onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false
                // sh 'cp /var/lib/jenkins/workspace/practise/demo_project/target/java-tomcat-maven-example.war /var/lib/tomcat/webapps'
            }
        }
    }
}
