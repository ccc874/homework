二、单表查询
1. select * from TEACHER where TNAME like '李%';
2.从性别='女'的学生中选择计数（*）;
  选择来自学生的计数（*），其中sex ='男';
3.通过sname从学生组中选择sname，count（*）;
4.选择*来自学生的生日如'1981％';
5.选择SID，从sc1得分> 60;
从sc1中选择avg（得分），得分> 60;
6.从sc1中选择count（distinct sid）;
7.通过计数（cid）> 1的sid从sc1组中选择sid;
8.通过cid从sc1组中选择cid，max（得分），min（得分）;
9.通过cid顺序（sid）desc，cid asc从sc1组中选择cid，count（sid）;

1.从emp中选择* timestampdiff（year，hiredate，now（））> 38;
2.选择* from emp where month（hiredate）= month（now（））;
3.选择* from emp where month（hiredate）= month（date_add（now（），interval 1 month））;
4.选择* from emp where month（year（hiredate）='1980'）> 6;
5.选择empno，ename from emp，其中length（ename）= 4;
6.按工作从emp组中选择工作，min（sal）;
7.逐月从emp组中选择count（*），month（hiredate）（hiredate）;
8.通过deptno从emp组中选择max（sal），deptno;
9.通过deptno，job选择max（sal），deptno，来自emp group的工作;
10.通过deptno从emp组中选择max（sal），avg（sal），deptno;
11.从emp中选择avg（sal），其中deptno = 10;
从emp中选择avg（sal），其中deptno = 20;
12.选择deptno，avg（sal）来自emp group by deptno，avg（sal）> 2000;
13.通过有工作='经理'的工作从emp组中选择计数（*）;
14.通过sal desc limit 3从emp命令中选择*;
15.通过sal desc limit 6,5选择* from emp order;
三、多表连接查询
1.选择c.cname，t.tname，sc.score，s.sname来自sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s on s.sid = sc.sid其中s.sname ='李四';
2.选择c.cname，s.sname从sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s on s.sid = sc.sid where c.cname不在（'企业管理'，'马克思'，'UML'，'英语'，'语文'，'数学'）和s.sname ='王五'group by c.cname;
3.选择s.sid，s.sname，count（*），sum（得分）来自sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s.sid上的s.sid = sc.sid group;
4.选择s.sid，s.sname来自sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s on s.sid = sc.sid where sc.sscore <= 60 group by s.sid;
5。
6.选择c.cname，count（*）来自sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s on s.sid = sc.sid c.cid小组;
7.选择s.sname，s.sid来自sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s on s.sid = sc.sid group由s.sid计数（c.cname）= 1;
8.从scc sc内部联接课程c中选择sc.cid，c.cname，avg（sc.score）sc.cid = c.cid内部联接教师t on t.tid = c.tid内部联接学生s .sid = sc.sid group by sc.cid order by avg（sc.score）asc，c.cid desc;
9.选择s.sid，s.sname，avg（sc.score）来自sc.s sc = s.sid组的sc1 sc内连接学生s.sid有avg（sc.score）> 80;
10。
11.选择c.cid，c.cname来自sc1 sc内连接课程c on sc.cid = c.cid inner join teacher t on t.tid = c.tid inner join student s on s.sid = sc.sid group由cid计数（*）= 7;
12.通过s.sid计数（sc.score <60）> 2，从sc1 sc内连接学生组中选择s.sid，avg（sc.score）;