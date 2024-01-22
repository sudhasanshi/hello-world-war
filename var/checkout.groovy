#!/usr/bin/env groovy

def call(String name= 'git repo URL') {
  sh 'git clone $(url)'
}
