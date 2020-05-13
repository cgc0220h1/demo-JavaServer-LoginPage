<%--
  Created by IntelliJ IDEA.
  User: Duc
  Date: 5/13/2020
  Time: 7:50 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML>
<html>
<style type="text/css">
  .login {
    height:180px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<form type="text" method="get" action="/login">
  <div class="login">
    <h2>Login</h2>
    <label>
      <input name="username" size="30"  placeholder="username" />
    </label>
    <label>
      <input type="password" name="password" size="30" placeholder="password" />
    </label>
    <input type="submit" value="Sign in"/>
  </div>
</form>
</body>
</html>
