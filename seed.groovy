freeStyleJob('example') {
    scm {
        git{
            remote {
                name('origin')
                url('https://github.com/teja-cloudnative/ansible.git')
            }
        }
    }

    steps {
        shell('ls -ltr')
    }
}

folder('Terraform') {
    displayName('Terraform')
    description('Terraform')
}