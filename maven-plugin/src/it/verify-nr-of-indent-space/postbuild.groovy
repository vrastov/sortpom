log = new File(basedir, 'build.log')

assert log.exists()
assert log.text.contains('[ERROR] The line 3 is not considered sorted, should be \'  <modelVersion>4.0.0</modelVersion>\'')


return true
