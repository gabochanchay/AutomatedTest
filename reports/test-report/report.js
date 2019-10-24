$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactManager.feature");
formatter.feature({
  "line": 1,
  "name": "Prueba de edicion de un precio dentro de un convenio",
  "description": "",
  "id": "prueba-de-edicion-de-un-precio-dentro-de-un-convenio",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1693310978,
  "status": "passed"
});
formatter.before({
  "duration": 212211503,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log in en el sistema a vender para editar un precio",
  "description": "",
  "id": "prueba-de-edicion-de-un-precio-dentro-de-un-convenio;log-in-en-el-sistema-a-vender-para-editar-un-precio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Selecciono el menu de convenios",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Selecciono el conveio que voy a editar",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Selecciono el plan de precios qeu voy a editar",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Selecciono y edito el precio que deseo.",
  "keyword": "Then "
});
formatter.match({
  "location": "EditarPrecio.seleccionoElMenuDeConvenios()"
});
formatter.result({
  "duration": 132415844,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dMac OS X 10.15.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 11 milliseconds\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027Gabriels-MacBook-Pro.local\u0027, ip: \u00272800:bf0:16f:2fca:7dd7:a98b:8fd3:49f4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_192-ea\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{message\u003dsession not created: This version of ChromeDriver only supports Chrome version 74\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dMac OS X 10.15.0 x86_64), platform\u003dANY}]\nSession ID: 6f2a05633b3ee6995d80c9ae3d4fac45\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:322)\n\tat cucumber.EditarPrecio.seleccionoElMenuDeConvenios(EditarPrecio.java:36)\n\tat ✽.Then Selecciono el menu de convenios(contactManager.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "EditarPrecio.seleccionoElConveioQueVoyAEditar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditarPrecio.seleccionoElPlanDePreciosQeuVoyAEditar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EditarPrecio.seleccionoYEditoElPrecioQueDeseo()"
});
formatter.result({
  "status": "skipped"
});
});