/*


 *  
 *  @version     1.0, Nov 8, 2014
 *  @author karan
 */
package com.nus.is5126.lcsia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nus.is5126.lcsia.dao.ICoreDao;
import com.nus.is5126.lcsia.entity.LoanProcessed;
import com.nus.is5126.lcsia.form.MasterForm;
import com.nus.is5126.lcsia.service.ICoreService;

@Service("coreService")
public class CoreServiceImpl implements ICoreService {

    @Autowired
    private ICoreDao coreDao;
    

    @Override
    public List<String> getStateList() {
        return coreDao.getStateList();
    }

    @Override
    public List<LoanProcessed> getLoanResults(MasterForm masterForm) {
        return coreDao.getLoanResults(masterForm);
    }

}
