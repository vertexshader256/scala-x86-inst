package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Swap GS Base Register
// Category: general

object SWAPGS extends InstructionDefinition("SWAPGS") with SWAPGSImpl

trait SWAPGSImpl {
  implicit object SWAPGS_0 extends SWAPGS._0 {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 7
    override def hasImplicitOperand = true
  }
}
