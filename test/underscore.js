var _ = {
    size: function(obj) { return Object.keys(obj).length },
    clone: function(obj) { return obj instanceof Array ? obj.slice() : Object.assign({}, obj) },
    failableInit: function(obj) { return obj.$failed ? null : obj }
};
