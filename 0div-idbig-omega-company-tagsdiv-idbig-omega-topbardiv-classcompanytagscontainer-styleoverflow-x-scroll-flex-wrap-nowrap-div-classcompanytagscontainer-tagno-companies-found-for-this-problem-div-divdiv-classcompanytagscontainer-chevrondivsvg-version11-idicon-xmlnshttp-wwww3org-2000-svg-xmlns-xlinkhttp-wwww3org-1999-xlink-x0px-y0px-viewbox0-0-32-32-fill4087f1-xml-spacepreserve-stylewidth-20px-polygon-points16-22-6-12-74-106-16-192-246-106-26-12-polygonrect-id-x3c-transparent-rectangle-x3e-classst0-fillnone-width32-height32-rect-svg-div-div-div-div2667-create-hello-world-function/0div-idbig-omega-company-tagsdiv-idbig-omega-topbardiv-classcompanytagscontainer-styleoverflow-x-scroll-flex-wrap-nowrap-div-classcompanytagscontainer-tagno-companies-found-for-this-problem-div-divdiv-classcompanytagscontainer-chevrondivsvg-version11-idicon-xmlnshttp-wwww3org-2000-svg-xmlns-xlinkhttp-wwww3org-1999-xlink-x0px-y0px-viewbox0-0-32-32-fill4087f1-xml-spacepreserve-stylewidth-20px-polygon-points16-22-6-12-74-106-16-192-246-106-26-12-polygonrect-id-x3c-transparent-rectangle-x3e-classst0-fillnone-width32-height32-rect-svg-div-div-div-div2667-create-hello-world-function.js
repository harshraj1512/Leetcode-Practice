/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    function f() {
        return "Hello World";
    }
    return f;
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */