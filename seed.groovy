folder('Terraform') {
    displayName('Terraform')
    description('Terraform')
}


//jobs.each {
//    def newmap = it;
//    //println("    ${it.name}: ${it.git}");
//    x = it.git
//    freeStyleJob("Terraform/${it.name}") {
//        scm {
//            git {
//                remote {
//                    name('origin')
//                    url("https://github.com/raghudevopsb62/${x}.git")
//                }
//                branches('*/main')
//            }
//        }
//
//        steps {
//            shell('make')
//        }
//
//    }
//}

def jobs= [
        [name : "VPC", git : "terraform-vpc"],
        [name : "DB", git : "terraform-databases" ]
]

jobs.each {
    def newmap = it;
    //println("    ${it.name}: ${it.git}");
    x = it.git
    pipelineJob("Terraform/${it.name}") {
      definition {
        cpsScm {
          scm {
            git {
              remote {
                url("https://github.com/teja-cloudnative/jenkins.git")
              }

            }
          }
          scriptPath('Jenkinsfile')
        }
      }
    }
}

//pipelineJob('github-demo') {
//   definition {
//     cpsScm {
//       scm {
//         git {
//            remote {
//               url('https://github.com/teja-cloudnative/jenkins.git')
//               }
//
//               }
//            }
//         scriptPath('Jenkinsfile')
//        }
//    }
//}