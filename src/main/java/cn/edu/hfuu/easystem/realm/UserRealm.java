package cn.edu.hfuu.easystem.realm;

import cn.edu.hfuu.easystem.Common.ActiveUser;
import cn.edu.hfuu.easystem.entity.User;
import cn.edu.hfuu.easystem.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = authenticationToken.getPrincipal().toString();
        User user = userService.findByUserName(username);
        if (user != null) {
            ActiveUser activeUser = new ActiveUser();
            activeUser.setUser(user);
            ByteSource credentialsSalt = ByteSource.Util.bytes("KyuM2I%H");
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(activeUser, user.getPassword(), credentialsSalt, this.getName());
            return info;
        }
        return null;
    }
}
