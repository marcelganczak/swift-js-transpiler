var _ = {
    size: function(obj) { return Object.keys(obj).length },
    clone: function(obj) { let cloned = {}; for(var key in obj) {cloned[key] = obj[key]} return cloned; }
};
