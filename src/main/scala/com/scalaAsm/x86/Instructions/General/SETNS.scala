package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set Byte on Condition - not sign (SF=0)
// Category: general/datamov

object SETNS extends InstructionDefinition("SETNS") with SETNSImpl

trait SETNSImpl {
  implicit object SETNS_0 extends SETNS._1[rm8] {
    val opcode: TwoOpcodes = (0x0F, 0x99) /+ 0
  }
}
