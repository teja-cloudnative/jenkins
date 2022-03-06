folder('Terraform') {
    displayName('Terraform')
    description('Terraform')
}

def jobs= [
        [name : "VPC", git : "terraform-vpc"],
        [name : "DB", git : "terraform-databases" ]
]

jobs.each {
    def newmap = it;
    //println("    ${it.name}: ${it.git}");
    x = it.git
    freeStyleJob("Terraform/${it.name}") {
        scm {
            git {
                remote {
                    name('origin')
                    url("https://github.com/raghudevopsb62/${x}.git")
                }
                branches('*/main')
            }
        }

        steps {
            shell('make')
        }

    }
}