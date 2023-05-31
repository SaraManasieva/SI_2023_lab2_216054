<h1>Втора лабораториска вежба по Софтверско инженерство</h1>
<h2>Сара Манасиева, бр. на индекс 216054</h2>
<h3>Control Flow Graph</h3>
<div>Фотографија од control flow graph-ot</div>

![cfg4](https://github.com/SaraManasieva/SI_2023_lab2_216054/assets/107801296/e58d02a9-a463-4d0d-92e5-b3441df47a13)
<h3>Цикломатска комплексност</h3>
<p>Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.</p>
<p>Истото може да се добие и на следниот начин:</p>
<p>Број на јазли: N = 23</p>
<p>Број на ребра: E = 31</p>
<p>CFG = E - N + 2 = 10</p>
<p>Може да се користи и бројот на региони:</p>
<p>Број на региони = 10 => CFG = 10</p>
<h3>Тест случаи според критериумот Every Branch</h3>

<table>
    <tr>
        <td>Every Branch</td>
        <td>Test case 1</td>
        <td>Test case 2</td>
        <td>Test case 3</td>
        <td>Test case 4</td>
        <td>Test case 5 </td>
    </tr>
    <tr>
        <td>1-2</td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>1-3</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>3-4</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>3-5</td>
        <td> </td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>4-5</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>5-12</td>
        <td> </td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>5-6</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>6-7.1</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>7.1-7.2</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>7.2-12</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>7.2-8</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>7.3-7.2</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>8-10</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>8-9</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>9-10</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>10-7.3</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td>*</td>
        <td>* </td>
    </tr>
    <tr>
        <td>10-11</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>11-7.3</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>12-13</td>
        <td> </td>
        <td> </td>
        <td> </td>
        <td>*</td>
        <td> </td>
    </tr>
    <tr>
        <td>12-14</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td> </td>
        <td>* </td>
    </tr>
    <tr>
        <td>13-19</td>
        <td> </td>
        <td> </td>
        <td> </td>
        <td>*</td>
        <td> </td>
    </tr>
    <tr>
        <td>14-18</td>
        <td> </td>
        <td> </td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>14-15.1</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td> </td>
        <td>* </td>
    </tr>
    <tr>
        <td>15.1-15.2</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>15.2-18</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>15.2-16</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>15.3-15.2</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>16-15.3</td>
        <td> </td>
        <td>*</td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>16-17</td>
        <td> </td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>17-19</td>
        <td> </td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
    </tr>
    <tr>
        <td>18-19</td>
        <td> </td>
        <td>*</td>
        <td> </td>
        <td> </td>
        <td>* </td>
    </tr>
</table>

<p>Објаснување на тест случаите:</p>
<ul>
  <li>Test case 1: Овој тест случај е за exception, List<User> allUsers=new ArrayList<User>(); User user=null;</li>
  <li>Test case 2: Во овој тест случај user.username=null и листата allUsers=[u1,u2,u3,...] каде постои ui за i={1,2,3...} за кое ui.username=ui.email=user.email, при што во табелата е испишано кои гранки се изминуваат во тој случај  </li> 
  <li>Test case 3: Во овој тест случај user.password содржи специјален знак и user.email не содржи @ со цел да ги опфатиме и другите гранки напишани во табелата.</li>
  <li>Test case 4: Во овој тест случај user.password<8 со цел да ги опфатиме другите гранки кои не се изминати од останатите тест случаи.</li>
  <li>Test case 5: Во овој тест случај user.password содржи празно место со што ги изминуваме сите гранки. </li>
</ul>


<h3>Тест случаи според критериумот Multiple Condition</h3>
<table>
    <tr>
        <td>Multiple Condition </td>
        <td>user == null</td>
        <td>user.getPassword() == null</td>
        <td>user.getEmail() == null </td>
    </tr>
    <tr>
        <td>Test case 1</td>
        <td>T</td>
        <td>anything</td>
        <td>anything </td>
    </tr>
    <tr>
        <td>Test case 2</td>
        <td>F</td>
        <td>T</td>
        <td>anything </td>
    </tr>
    <tr>
        <td>Test case 3</td>
        <td>F</td>
        <td>F</td>
        <td>T </td>
    </tr>
    <tr>
        <td>Test case 4</td>
        <td>F</td>
        <td>F</td>
        <td>F </td>
    </tr>
</table>

<p>Објаснување на тест случаите:</p>
<ul>
  <li>Test case 1: T || X || X Во овој тест случај доволно е првиот исказ да е точен за да биде исполнет условот.</li>
  <li>Test case 2: F || T || X Во овој тест случај доколку е неточен првиот исказ а вториот точен третитот не се евалуира.</li>
  <li>Test case 3: F || F || T Во овој тест случај доколку првите два искази се неточни точноста на условот ќе зависи од третиот исказ што во овој случај е точно.</li>
  <li>Test case 4: F || F || F Во овој тест случај доколку првите два искази се неточни точноста на условот ќе зависи од третиот исказ што во овој случај е неточно.</li>
</ul>

<h3>Тестови</h3>

<pre>
<!--code Tag starts here -->
<code>
class SILab2Test {

    @Test
    void everyBranchTest() {
        //Test case 1
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //Test case 2
        List<User> allUsers2=new ArrayList<User>();
        allUsers2.add(new User("email@gmail.com","password1" ,"email@gmail.com"));
        allUsers2.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers2.add(new User("username3","password3" ,"email3@gmail.com"));
        User user2=new User(null,"password" ,"email@gmail.com");

        assertEquals(false,SILab2.function(user2,allUsers2));

        //Test case 3
        List<User> allUsers3=new ArrayList<User>();
        allUsers3.add(new User("username1","password1" ,"email1@gmail.com"));
        allUsers3.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers3.add(new User("username3","password3" ,"email3@gmail.com"));
        User user3=new User("username","p@assword" ,"emailgmail.com");

        assertEquals(false,SILab2.function(user3,allUsers3));

        //Test case 4
        List<User> allUsers4=new ArrayList<User>();
        allUsers4.add(new User("username1","password1" ,"email1@gmail.com"));
        allUsers4.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers4.add(new User("username3","password3" ,"email3@gmail.com"));
        User user4=new User("username","pasword" ,"email@gmail.com");

        assertEquals(false,SILab2.function(user4,allUsers4));

        //Test case 5
        List<User> allUsers5=new ArrayList<User>();
        allUsers5.add(new User("username1","password1" ,"email1@gmail.com"));
        allUsers5.add(new User("username2","password2" ,"email2@gmail.com"));
        allUsers5.add(new User("username3","password3" ,"email3@gmail.com"));
        User user5=new User("username","pas sword" ,"email@gmail.com");

        assertEquals(false,SILab2.function(user5,allUsers5));

    }

    @Test
    void multipleConditionTest(){
        //if (user==null || user.getPassword()==null || user.getEmail()==null).
        //T || X || X
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //F || T || X
        User user1=new User("username",null ,"email@gmail.com");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user1,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //F || F || T
        User user2=new User("username","password" ,null);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(user2,new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        //F || F || F
        User user3=new User("username","password" ,"email@gmail.com");
        assertEquals(false,SILab2.function(user3,new ArrayList<>()));
    }

}
<!--code Tag starts here -->
</code>
</pre>
  
  
