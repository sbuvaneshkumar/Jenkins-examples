node {
    writeFile file: 'groovy144.txt', text: 'hello.'
    sh 'ls -l groovy144.txt'
    sh 'cat groovy144.txt'
}
