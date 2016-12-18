Array.prototype.sortBool = function(iteratee) {
    var _iteratee = function(a, b) {return iteratee(a, b) ? -1 : 1};
    return this.sort(_iteratee);
};
