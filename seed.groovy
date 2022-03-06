folder('Terraform') {
    displayName('Terraform')
    description('Terraform')
}
freeStyleJob('Terraform/VPC') {
    scm {
        git{
            remote {
                name('origin')
                url('https://github.com/teja-cloudnative/terraform-vpc.git')
            }
        }
    }

    steps {
        shell('make')
    }
}

freeStyleJob('Terraform/DB') {
    scm {
        git{
            remote {
                name('origin')
                url('https://github.com/teja-cloudnative/terraform-databases.git')
            }
        }
    }

    steps {
        shell('make')
    }
}

freeStyleJob('Terraform/ALB') {
    scm {
        git{
            remote {
                name('origin')
                url('https://github.com/teja-cloudnative/terraform-mutable-alb.git')
            }
        }
    }

    steps {
        shell('make')
    }
}