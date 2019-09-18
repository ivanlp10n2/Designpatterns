
function piResponse() {
    piSetCookie('visitor_id12882', '525394183', 3650);
    piSetCookie('visitor_id12882-hash', '88c4611e21b75833e0e88aefcf531dd72dccadad7dc0bce5969ae5d46fce8ef9a6f7150e003aa4fd0d5007a8d80897fe469837fd', 3650);

    if (document.location.protocol != "https:" || (document.location.protocol == "https:" && true)) {
        var analytics_link = document.location.protocol + "//" + "www2.infosecinstitute.com/analytics?";
        pi.tracker.visitor_id='525394183';

        pi.tracker.visitor_id_sign='88c4611e21b75833e0e88aefcf531dd72dccadad7dc0bce5969ae5d46fce8ef9a6f7150e003aa4fd0d5007a8d80897fe469837fd';

        var variables = 'conly=true';
        for (property in pi.tracker) {
            variables += "&" + property + "=" + encodeURIComponent(pi.tracker[property]);
        }
        var headID = document.getElementsByTagName("head")[0];
        piScriptObj[piScriptNum] = document.createElement('script');
        piScriptObj[piScriptNum].type = 'text/javascript';
        piScriptObj[piScriptNum].src = analytics_link + variables;
        headID.appendChild(piScriptObj[piScriptNum]);
        piScriptObj[piScriptNum].onload = function() { return; }
    }
}
piResponse();




