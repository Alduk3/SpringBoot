package com.riwi.riwiplatform.infrastructure.abstract_services;

import com.riwi.riwiplatform.utils.enums.SortType;
import org.springframework.data.domain.Page;

public interface CRUDService <RQ,RS,ID>{
    public RS create(RQ request);
    public RS get(ID id);
    public RS update(RQ request, ID id);
    public void delete(ID id);
    public Page<RS> getAll(int page, int size, SortType sort);
}
