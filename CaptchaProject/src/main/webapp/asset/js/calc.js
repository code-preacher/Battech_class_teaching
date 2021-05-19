function calc(id) {
  t1 = 0;
  t2 = 0;
  ex = 0;

  if ((document.getElementById(id+"t1").value != "") || (document.getElementById(id+"t1").value != null) ) {
    t1 = Number(document.getElementById(id+"t1").value);
  }
  if ((document.getElementById(id+"t2").value != "") || (document.getElementById(id+"t2").value != null) ) {
    t2 = Number(document.getElementById(id+"t2").value);
  }
  if ((document.getElementById(id+"ex").value != "") || (document.getElementById(id+"ex").value != null) ) {
    ex = Number(document.getElementById(id+"ex").value);
  }
  total = t1 + t2 + ex;
  document.getElementById(id+"tt").value = total;
}
