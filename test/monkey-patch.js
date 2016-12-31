Array.prototype.sortBool = function(iteratee) {
    var _iteratee = function(a, b) {return iteratee(a, b) ? -1 : 1};
    return this.sort(_iteratee);
};
Array.prototype.pushMany = function(items) {
    return this.push.apply(this, items);
};
Array.prototype.pushManyAt = function(items, at) {
    return this.splice.apply(this, [at, 0].concat(items));
};
