<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<meta charset="UTF-8">
<title>登录界面</title>
<link rel="stylesheet" type="text/css" href="/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/js/easyui/themes/icon.css">
<script type="text/javascript" src="/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript">

</script>
<body>
<div id="w" class="easyui-window" title="login" data-options="iconCls:'icon-save'">
        <form id="ff" method="post" style="padding:20px">
            <table>
                <tr>
                    <td>账户:</td>
                    <td><input class="easyui-validatebox" type="text" name="name" data-options="required:true"></input></td>
                </tr>
                <tr>
                    <td>密码:</td>
                    <td><input class="easyui-validatebox" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
                </tr>
            </table>
        </form>
        <div style="text-align:center;padding:5px">
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
        </div>
</div>

</body>
</html>
