/*


 *  
 *  @version     1.0, May 18, 2012
 *  @author Karan
 */
package com.nus.is5126.lcsia.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nus.is5126.lcsia.dao.ICoreDao;
import com.nus.is5126.lcsia.entity.LoanProcessed;
import com.nus.is5126.lcsia.form.MasterForm;

@Repository("coreDao")
@SuppressWarnings("unchecked")
@Transactional
public class CoreDaoImpl implements ICoreDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<String> getStateList() {
        Query query = sessionFactory.getCurrentSession().createQuery(" from UsState");
        return query.list();
    }

    @Override
    public List<LoanProcessed> getLoanResults(MasterForm masterForm) {
        String stateId = masterForm.getStateId();
        String resultNo = masterForm.getResultNo();
        Double amtToInv = masterForm.getAmtToInvest();
        String purpose = masterForm.getPurpose();
        Query query = null;
        StringBuffer filterAppendStr = new StringBuffer();
        filterAppendStr.append("addrState=:addrState and loanAmnt<=:loanAmnt and loanStatus='current' and predicted>=0.8");
        if (purpose != null & purpose.length() > 0) {
            filterAppendStr.append(" and purpose=:purpose");
        }

        String filterStr = filterAppendStr.toString();
        query = sessionFactory.getCurrentSession().createQuery(" from LoanProcessed where " + filterStr).setMaxResults(Integer.parseInt(resultNo));
        query.setParameter("addrState", stateId);
        query.setParameter("loanAmnt", amtToInv);
        if (purpose != null & purpose.length() > 0) {
            query.setParameter("purpose", purpose);
        }
        return query.list();
    }

}
