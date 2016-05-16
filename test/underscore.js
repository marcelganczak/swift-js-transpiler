var _ = {
    size: function(obj) { return Object.keys(obj).length },
    clone: function(obj) {
        let cloned;
        if(obj instanceof Array) {cloned = []; for(let i = 0; i < obj.length; i++) cloned.push(obj[i]);}
        else {cloned = {}; for(let key in obj) cloned[key] = obj[key];}
        return cloned;
    }
};
