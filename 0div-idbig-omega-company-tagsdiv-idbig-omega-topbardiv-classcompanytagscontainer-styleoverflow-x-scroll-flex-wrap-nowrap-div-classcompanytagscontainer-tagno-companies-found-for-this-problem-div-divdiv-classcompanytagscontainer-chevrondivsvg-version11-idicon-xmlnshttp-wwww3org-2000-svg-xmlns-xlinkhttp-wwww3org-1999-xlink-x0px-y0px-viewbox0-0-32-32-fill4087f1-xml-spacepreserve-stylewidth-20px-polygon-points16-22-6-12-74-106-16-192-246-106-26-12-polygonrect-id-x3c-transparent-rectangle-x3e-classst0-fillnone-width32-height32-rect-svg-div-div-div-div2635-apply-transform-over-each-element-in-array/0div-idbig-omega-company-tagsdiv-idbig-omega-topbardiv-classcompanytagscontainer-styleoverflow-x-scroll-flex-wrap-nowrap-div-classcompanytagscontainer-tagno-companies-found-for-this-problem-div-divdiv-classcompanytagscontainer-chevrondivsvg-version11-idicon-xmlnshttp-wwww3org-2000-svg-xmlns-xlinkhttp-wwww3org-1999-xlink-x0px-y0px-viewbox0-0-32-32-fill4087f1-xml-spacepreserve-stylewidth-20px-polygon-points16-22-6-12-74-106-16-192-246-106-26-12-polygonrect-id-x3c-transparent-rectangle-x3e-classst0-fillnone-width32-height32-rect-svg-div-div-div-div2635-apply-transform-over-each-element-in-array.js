/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const arrs = [];
    for(let i = 0; i < arr.length;i++){
        arrs[i] = fn(arr[i], i)
    }
    return arrs
};