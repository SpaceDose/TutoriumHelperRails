import CodeMirror from 'codemirror/lib/codemirror.js'
import 'codemirror/lib/codemirror.css'
import 'codemirror/mode/javascript/javascript.js'
import 'codemirror/theme/darcula.css'

window.addEventListener('load', function () {
    var myCodeMirror = CodeMirror(document.getElementById("myEditor"), {
        value: "function myScript(){return 100;}\n",
        lineNumbers: true,
        theme: "darcula",
        mode:  "javascript" })
})