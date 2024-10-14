log = new File(basedir, 'build.log')

assert log.exists()
assert log.text.contains('[ERROR] The line 11 is not considered sorted, should be \'\'')


return true
