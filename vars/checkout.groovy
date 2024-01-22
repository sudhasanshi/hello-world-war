
def call(String name= 'gitrepo'){
  sh '''
  git clone $(url)
'''
}
