jQuery.extend({
  getUrlVars: function(){
    var vars = [], hash;
    var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
    for(var i = 0; i < hashes.length; i++)
    {
      hash = hashes[i].split('=');
      vars.push(hash[0]);
      vars[hash[0]] = hash[1];
    }
    return vars;
  },
  getUrlVar: function(name){
    return jQuery.getUrlVars()[name];
  }
});

jQuery(document).ready(
    function() {
	var activeTab = jQuery.getUrlVar('active');
	jQuery("li.active").attr('class', '');
	jQuery("li :contains('" + activeTab + "')").parent().attr("class", "active");
    }
);
