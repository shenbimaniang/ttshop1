<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<table id="dg"></table>

<script>
    var toolbar = [{
        iconCls: 'icon-add',
        text: '新增',
        handler: function () {
            console.log('add');
        }
    }, {
        iconCls: 'icon-remove',
        text: '删除',
        handler: function () {
            var selectRows = $('#dg').datagrid('getSelections');
            if (selectRows.length==0){
                $.messager.alert('提示','未选中记录','warning');
                return;
            }

            $.messager.confirm('确认','您确认想要删除记录吗',function (r) {
                if (r){
                    var ids =[];
                    for (var i = 0;i<selectRows.length;i++){
                        ids.push(selectRows[i].id)
                    }
                    $.post(
                        'item/batch',
                        {'ids[]':ids},
                        function (data) {
                            $('#dg').datagrid('reload');
                        },
                        'json'
                    )
                }
            })
        }
    }, {
        iconCls: 'icon-edit',
        text: '编辑',
        handler: function () {
            console.log('edit');
        }
    }, {
        iconCls: 'icon-up',
        text: '上架',
        handler: function () {
            var selectRows = $('#dg').datagrid('getSelections');
            if (selectRows.length==0){
                $.messager.alert('提示','未选中记录','warning');
                return;
            }
            $.messager.confirm('确认','您确认想要上架这些商品吗',function (r) {
                if (r){
                    var ids =[];
                    for (var i = 0;i<selectRows.length;i++){
                        ids.push(selectRows[i].id)
                    }
                    $.post(
                        'item/up',
                        {'ids[]':ids},
                        function (data) {
                            $('#dg').datagrid('reload');
                        },
                        'json'
                    )
                }
            })
        }
    }, {
        iconCls: 'icon-down',
        text: '下架',
        handler: function () {
            var selectRows = $('#dg').datagrid('getSelections');
            if (selectRows.length==0){
                $.messager.alert('提示','未选中记录','warning');
                return;
            }
            $.messager.confirm('确认','您确认想要下架这些商品吗',function (r) {
                if (r){
                    var ids =[];
                    for (var i = 0;i<selectRows.length;i++){
                        ids.push(selectRows[i].id)
                    }
                    $.post(
                        'item/down',
                        {'ids[]':ids},
                        function (data) {
                            $('#dg').datagrid('reload');
                        },
                        'json'
                    )
                }
            })
        }
    }]


    $('#dg').datagrid({
        pageSize: 20,
        toolbar: toolbar,
        fit: true,
        pagination: true,
        url: 'items',
        columns: [[
            {field:'ck',checkbox:true},
            {field: 'id', title: '商品编号', width: 100},
            {field: 'title', title: '商品名称', width: 100},
            {field: 'sellPoint', title: '卖点', width: 100},
            {field: 'catName', title: '类别', width: 100},
            {
                field: 'status', title: '状态', formatter: function (value, row, index) {
                switch (value) {
                    case 1:
                        return '正常';
                        break;
                    case 2:
                        return '下架';
                        break;
                    case 3:
                        return '删除';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }
            }
        ]]
    });
</script>